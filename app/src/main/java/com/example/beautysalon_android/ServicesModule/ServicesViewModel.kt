package com.example.beautysalon_android.ServicesModule

class Service(val name: String?, val imageURL: String?, val price: Int?, val description: String?) {
}


class ServicesViewModel {
    var services = mutableListOf<Service>()

    fun getServices() {
        services.add(Service(name = "Бровки", imageURL = "", price = 1200, "брови домиком брови домиком брови домиком брови домиком брови домиком брови домиком брови домиком брови домикомброви домикомброви домиком  v брови домиком v vброви домикомvvvброви домикомc брови домикомброви домиком vброви домиком"))
        services.add(Service(name = "Губки", imageURL = "", price = 1200, "губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком губки бантиком"))
        services.add(Service(name = "Маникюр", imageURL = "", price = 1200, "маник супер маник супер маник супер маник супер маник супер маник супер маник супер маник супер маник супер маник супер маник супер маник супер маник супер маник супер маник супер маник супер маник супер маник супер маник супер маник супер "))
    }

}