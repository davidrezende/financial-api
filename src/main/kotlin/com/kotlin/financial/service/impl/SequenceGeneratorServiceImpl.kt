package com.kotlin.financial.service.impl

import com.kotlin.financial.model.collection.DatabaseSequence
import com.kotlin.financial.service.SequenceGeneratorService
import org.springframework.data.mongodb.core.FindAndModifyOptions.options
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.query.Query.query
import org.springframework.data.mongodb.core.query.Update
import org.springframework.data.mongodb.core.query.where
import org.springframework.stereotype.Service
import java.util.*
import kotlin.reflect.KProperty


@Service
class SequenceGeneratorServiceImpl(private val mongoOperations: MongoOperations) : SequenceGeneratorService {

    override fun generateSequence(seqName: String): Long {
        val counter = mongoOperations.findAndModify(
            query(where(key = KProperty<*>::name).`is`(seqName)),
            Update().inc("seq", 1), options().returnNew(true).upsert(true),
            DatabaseSequence::class.java
        )
        return if (!Objects.isNull(counter)) counter!!.seq else 1
    }
}