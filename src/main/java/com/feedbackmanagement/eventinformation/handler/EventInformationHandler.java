package com.feedbackmanagement.eventinformation.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.feedbackmanagement.eventinformation.model.EventInformation;
import com.feedbackmanagement.eventinformation.model.EventSummary;
import com.feedbackmanagement.eventinformation.model.Message;
import com.feedbackmanagement.eventinformation.repository.EventInformationRepository;
import com.feedbackmanagement.eventinformation.repository.EventSummaryRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class EventInformationHandler {

	@Autowired
	EventInformationRepository eventInformationRepository;
	
	@Autowired
	EventSummaryRepository eventSummaryRepository;
	
	public Mono<ServerResponse> getAllEvents(ServerRequest serverRequest) {
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(eventInformationRepository.findAll(), EventInformation.class);
	}
	
	public Mono<ServerResponse> saveEvent(ServerRequest sererRequest) {
		Mono<EventInformation> userMono = sererRequest.bodyToMono(EventInformation.class);
		return userMono.flatMap(user -> eventInformationRepository.findById(user.getEventId()).log().flatMap(
				dbUser -> ServerResponse.badRequest().body(BodyInserters.fromObject(new Message("User already exist")))).log()
				.switchIfEmpty(eventInformationRepository.save(user).flatMap(savedUser -> ServerResponse.ok()
						.contentType(MediaType.APPLICATION_JSON).body(BodyInserters.fromObject(savedUser))))).log();
	}
	
	public Mono<ServerResponse> getEventInformation(ServerRequest serverRequest){
		String id=serverRequest.pathVariable("id");
		Flux<EventSummary> test=eventSummaryRepository.findAll().log(); 
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(eventSummaryRepository.findAll().log(),EventSummary.class).log().switchIfEmpty(ServerResponse.badRequest().body(BodyInserters.fromObject(new Message("Event Doesnot exist"))));
	}
	public Mono<ServerResponse> saveEventSummary(ServerRequest sererRequest) {
		Mono<EventSummary> userMono = sererRequest.bodyToMono(EventSummary.class);
		return userMono
				.flatMap(user->eventSummaryRepository.save(user).flatMap(savedUser -> ServerResponse.ok()
						.contentType(MediaType.APPLICATION_JSON).body(BodyInserters.fromObject(savedUser)))).log();
	}
	

}
