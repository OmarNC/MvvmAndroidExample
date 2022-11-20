package com.onc.mvvmandroidexample.model.entities

class UserRepository {
    companion object{
        fun getFakeUsers() : ArrayList<User>{
            val list = arrayListOf<User>()
            list.add(User("Omar", "Nieto", 46))
            list.add(User("Omar2", "Nieto", 46))
            list.add(User("Omar3", "Nieto", 46))
            list.add(User("Omar4", "Nieto", 46))
            list.add(User("Omar5", "Nieto", 46))
            list.add(User("Omar6", "Nieto", 46))
            list.add(User("Omar7", "Nieto", 46))
            list.add(User("Omar8", "Nieto", 46))
            list.add(User("Omar9", "Nieto", 46))
            list.add(User("Omar10", "Nieto", 46))
            list.add(User("Omar11", "Nieto", 46))
            list.add(User("Omar12", "Nieto", 46))

            return  list
        }
    }
}