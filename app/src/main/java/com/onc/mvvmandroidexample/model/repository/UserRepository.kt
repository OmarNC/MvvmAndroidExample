package com.onc.mvvmandroidexample.model.repository

import com.onc.mvvmandroidexample.model.entities.User

class UserRepository {
    companion object{
        fun getFakeUsers() : ArrayList<User>{
            val list = arrayListOf<User>()
            list.add(User("Omar", "Nieto", 46, "https://conflictresolutionmn.org/wp-content/uploads/2020/01/flat-business-man-user-profile-avatar-icon-vector-4333097.jpg"))
            list.add(User("Omar", "Nieto", 46, "https://conflictresolutionmn.org/wp-content/uploads/2020/01/flat-business-man-user-profile-avatar-icon-vector-4333097.jpg"))
            list.add(User("Omar", "Nieto", 46, "https://conflictresolutionmn.org/wp-content/uploads/2020/01/flat-business-man-user-profile-avatar-icon-vector-4333097.jpg"))
            list.add(User("Omar", "Nieto", 46, "https://conflictresolutionmn.org/wp-content/uploads/2020/01/flat-business-man-user-profile-avatar-icon-vector-4333097.jpg"))
            list.add(User("Omar", "Nieto", 46, "https://conflictresolutionmn.org/wp-content/uploads/2020/01/flat-business-man-user-profile-avatar-icon-vector-4333097.jpg"))
            list.add(User("Omar", "Nieto", 46, "https://conflictresolutionmn.org/wp-content/uploads/2020/01/flat-business-man-user-profile-avatar-icon-vector-4333097.jpg"))
            list.add(User("Omar", "Nieto", 46, "https://conflictresolutionmn.org/wp-content/uploads/2020/01/flat-business-man-user-profile-avatar-icon-vector-4333097.jpg"))
            list.add(User("Omar", "Nieto", 46, "https://conflictresolutionmn.org/wp-content/uploads/2020/01/flat-business-man-user-profile-avatar-icon-vector-4333097.jpg"))
            list.add(User("Omar", "Nieto", 46, "https://conflictresolutionmn.org/wp-content/uploads/2020/01/flat-business-man-user-profile-avatar-icon-vector-4333097.jpg"))
            list.add(User("Omar", "Nieto", 46, "https://conflictresolutionmn.org/wp-content/uploads/2020/01/flat-business-man-user-profile-avatar-icon-vector-4333097.jpg"))
            list.add(User("Omar", "Nieto", 46, "https://conflictresolutionmn.org/wp-content/uploads/2020/01/flat-business-man-user-profile-avatar-icon-vector-4333097.jpg"))
            list.add(User("Omar", "Nieto", 46, "https://conflictresolutionmn.org/wp-content/uploads/2020/01/flat-business-man-user-profile-avatar-icon-vector-4333097.jpg"))
            list.add(User("Omar", "Nieto", 46, "https://conflictresolutionmn.org/wp-content/uploads/2020/01/flat-business-man-user-profile-avatar-icon-vector-4333097.jpg"))

            return  list
        }
    }
}