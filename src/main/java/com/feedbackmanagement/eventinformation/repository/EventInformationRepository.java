package com.feedbackmanagement.eventinformation.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.feedbackmanagement.eventinformation.model.EventInformation;


public interface EventInformationRepository extends ReactiveMongoRepository<EventInformation, String> {

}
