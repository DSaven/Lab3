package com.example.lab3
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    Singleton sgl = Singleton.getInstance()

    director = new Director()
    PlaneBuilder builder = new PlaneBuilder()
    director.constructCityPlane(builder)
    Plane plane = builder.getResult()

    hole = new RoundHole(2)
    sqPeg = new SquarePeg(2)
    sqPegAdapter = new SquarePegAdapter(sqPeg)
    hole.fits(sqPegAdapter)

    var server = Server()
    server.register('mail@mail.ru', '12345')
    server.register('some@mail.ru', '12345')

    val middleware = UserExistsMiddleware(server).linkWith(RoleCheckMiddleware())
    server.middleware = middleware
}

