package com.example.aluno.telalogin2_func

class SimulaBD {
    companion object {
        public fun login(username:String, password:String) : Boolean{
            var ret : Boolean = false
            if(username is String && password is String){
                if (username.equals("admin") && password.equals("admin123")){
                    ret = true;
                }
            }
            return ret;
        }
    }
}