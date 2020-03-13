package com.feedbackmanagement.eventinformation.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.feedbackmanagement.eventinformation.model.EventSummary;

import reactor.core.publisher.Flux;

public interface EventSummaryRepository  extends ReactiveMongoRepository<EventSummary, String>{

	Flux<EventSummary> findAllByEventId(String eventId);
}
