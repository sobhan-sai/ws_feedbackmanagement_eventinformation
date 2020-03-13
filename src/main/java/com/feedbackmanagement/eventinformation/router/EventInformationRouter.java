package com.feedbackmanagement.eventinformation.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.feedbackmanagement.eventinformation.handler.EventInformationHandler;

@Configuration
public class EventInformationRouter {

	@Bean
	public RouterFunction<ServerResponse> eventInformationRoute(EventInformationHandler eventInformationHandler) {
		return RouterFunctions
				.route(RequestPredicates.GET("/eventInformation/events").and(
						RequestPredicates.accept(MediaType.APPLICATION_JSON)), eventInformationHandler::getAllEvents)
				.andRoute(
						RequestPredicates.POST("/eventInformation")
								.and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
						eventInformationHandler::saveEvent)
				.andRoute(
						RequestPredicates.GET("/eventSummary/{id}")
								.and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
						eventInformationHandler::getEventInformation)
				.andRoute(
						RequestPredicates.POST("/eventSummary")
								.and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
						eventInformationHandler::saveEventSummary);
	}
}
