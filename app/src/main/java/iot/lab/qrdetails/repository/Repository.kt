package iot.lab.qrdetails.repository

import iot.lab.qrdetails.api.RetrofitInstance
import iot.lab.qrdetails.model.Data
import retrofit2.Response

class Repository {

    //This fetches the data of roll without filters
    suspend fun getPost(number : String) : Response<Data> {
        return RetrofitInstance.api.getPost(number)
    }

    //This fetches the data of roll of a fixed Date
    suspend fun getPostOfFixedDay(rollNumber : String ,inTimeDay : String , inTimeMonth : String, inTimeYear : String) : Response<Data>{
        return RetrofitInstance.api.getPostOfFixedDay(rollNumber , inTimeDay , inTimeMonth , inTimeYear)
    }

    //This fetches the data of roll in a given range of Date
    suspend fun getPostBetweenDays(rollNumber : String , inTimeBetween : String) : Response<Data>{
        return RetrofitInstance.api.getPostBetweenDays(rollNumber , inTimeBetween)
    }

}