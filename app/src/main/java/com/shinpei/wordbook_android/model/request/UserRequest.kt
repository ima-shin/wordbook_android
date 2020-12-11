package com.shinpei.wordbook_android.model.request


// ユーザー新規登録
data class NewUserRequest(val userName: String, val email: String, val password: String)

// 仮登録
data class TempUserRequest(val email: String)

// ログイン情報
data class LoginUserRequest(val email: String, val password: String)