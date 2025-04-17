package com.talhaatif.chatapp.mapper;

import com.talhaatif.chatapp.dto.request.ChatMessageRequest;
import com.talhaatif.chatapp.dto.response.ChatMessageResponse;
import com.talhaatif.chatapp.entity.ChatMessage;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-11T00:52:06+0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class ChatMapperImpl implements ChatMapper {

    @Override
    public ChatMessage toEntity(ChatMessageRequest request) {
        if ( request == null ) {
            return null;
        }

        ChatMessage chatMessage = new ChatMessage();

        chatMessage.setRoomId( request.roomId() );
        chatMessage.setSender( request.sender() );
        chatMessage.setContent( request.content() );
        chatMessage.setType( request.type() );

        chatMessage.setTimestamp( getCurrentTimestamp() );

        return chatMessage;
    }

    @Override
    public ChatMessageResponse toResponse(ChatMessage entity) {
        if ( entity == null ) {
            return null;
        }

        String id = null;
        String roomId = null;
        String sender = null;
        String content = null;
        ChatMessage.MessageType type = null;
        LocalDateTime timestamp = null;

        id = entity.getId();
        roomId = entity.getRoomId();
        sender = entity.getSender();
        content = entity.getContent();
        type = entity.getType();
        timestamp = entity.getTimestamp();

        ChatMessageResponse chatMessageResponse = new ChatMessageResponse( id, roomId, sender, content, type, timestamp );

        return chatMessageResponse;
    }
}
