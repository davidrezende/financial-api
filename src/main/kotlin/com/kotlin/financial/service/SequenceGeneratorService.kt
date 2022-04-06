package com.kotlin.financial.service

interface SequenceGeneratorService {
    fun generateSequence(seqName: String): Long
}