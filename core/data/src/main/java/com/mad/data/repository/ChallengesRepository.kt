package com.mad.data.repository

import ChallengeListQuery
import kotlinx.coroutines.flow.Flow
import type.ChallengeListInput

interface ChallengesRepository {
    suspend fun challengeListApi (input:ChallengeListInput): Flow<ChallengeListQuery.Data1>

}