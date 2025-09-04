package com.hsingh.sessionvsjwt.entity;

import lombok.Getter;

import java.util.List;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserStatus {

    INVITED("Invited"),
    PENDING_APPROVAL("Pending Approval"),
    APPROVED("Approved"),
    DEACTIVATED("Deactivated"),
    SUSPENDED("Suspended"),
    MARK_DELETED("Marked for deletion");

    private final String value;

}
