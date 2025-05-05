package com.bookstore.jpa.dto;

import java.util.Set;
import java.util.UUID;

public record BookRecordDTO(
    String title,
    UUID publisherId, 
    Set<UUID> authorsIds, 
    String reviewComment
 ){}
