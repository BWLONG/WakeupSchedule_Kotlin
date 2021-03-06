package com.suda.yzune.wakeupschedule.bean

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(foreignKeys = [(
        ForeignKey(entity = TableBean::class,
                parentColumns = ["id"],
                childColumns = ["tableId"],
                onUpdate = ForeignKey.CASCADE,
                onDelete = ForeignKey.CASCADE
        ))],
        primaryKeys = ["id", "tableId"],
        indices = [Index(value = ["tableId"], unique = false)])
data class CourseBaseBean(
        var id: Int,
        var courseName: String,
        var color: String,
        var tableId: Int
)