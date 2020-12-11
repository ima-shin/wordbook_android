package com.shinpei.wordbook_android.services

import com.shinpei.wordbook_android.model.request.LoginUserRequest
import com.shinpei.wordbook_android.model.request.NewUserRequest

interface UserService {
    fun requestNewUser(newUser: NewUserRequest)
    fun requestLogin(login: LoginUserRequest)
}
