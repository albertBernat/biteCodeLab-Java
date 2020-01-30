package com.ttpsc.bitecodelab.records.model;

import java.util.List;
import java.util.Set;

public record StudentRecord(
        String name,
        String secondName,
        Set<GroupRecord>groups,
        List<Grade>grades) {}
