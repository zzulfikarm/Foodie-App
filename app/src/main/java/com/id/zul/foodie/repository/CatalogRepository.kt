package com.id.zul.foodie.repository

import androidx.lifecycle.LiveData
import com.id.zul.foodie.model.Foods

class CatalogRepository(
    private val remoteRepository: RemoteRepository
) : CatalogSource {

    override fun getData(): LiveData<List<Foods>> {
        return remoteRepository.getData()
    }

}