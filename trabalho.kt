fun main(){
    var seg = ""
    var ter = ""
    var qua = ""
    var qui = ""
    var sex = ""

    while (true) {

        println("--------bem vindo ao Happy fitness--------")

        println("1 - deseja criar um cronograma de treino semanal")
        println("2 - deseja calcular sua taxa metabolica basal")
        println("3 - Deseja comparar seu progresso atual com o antigo")
        println("4 - deseja mostrar seu cronograma")
        println("5 - sair")
        println("--------------------------------------------")
        print("Escolha:")
        val opcao = readLine()

        if (opcao == "1") {
            println("\n=== Cronograma Semanal ===")

            print("Segunda: ")
            seg = readLine()!!

            print("Terça: ")
            ter = readLine()!!

            print("Quarta: ")
            qua = readLine()!!

            print("Quinta: ")
            qui = readLine()!!

            print("Sexta: ")
            sex = readLine()!!


        } else if (opcao == "2") {
            println("\n=== taxa metabolica basal ===")

            println("digite seu sexo biologico:")
            val sexo = readLine()

            if (sexo == "m" || sexo == "Homem") {

                println("Digite seu peso")
                val peso = readLine()!!.toDouble()

                println("digite sua altura em cm")
                val altura = readLine()!!.toInt()

                println("digite sua idade")
                val idade = readLine()!!.toInt()

                val tmb = 88.36 + (13.4 * peso) + (4.8 * altura) - (5.7 * idade)

                println("--------------------------------------------")
                println("Considerando a sua rotina de exercícios físicos:")
                println("--------------------------------------------")

                val nenhum = tmb * 1.2
                println("Nenhuma atividade física: %.2f".format(nenhum))
                println("--------------------------------------------")

                val moderada = tmb * 1.55
                println("Atividade física moderada: %.2f".format(moderada))
                println("meia hora de caminhada, natação ou bicicleta, quatro vezes por semana")

                println("--------------------------------------------")

                val intenso = tmb * 1.9
                println("Atividade física intensa: %.2f".format(intenso))
                println("uma hora de corrida, pelo menos quatro vezes por semana")

                println("--------------------------------------------")

            } else if (sexo == "f" || sexo == "Mulher") {

                println("Digite seu peso")
                val peso = readLine()!!.toDouble()

                println("digite sua altura em cm")
                val altura = readLine()!!.toInt()

                println("digite sua idade")
                val idade = readLine()!!.toInt()

                println("--------------------------------------------")

                val tmb = 447.6 + (9.2 * peso) + (3.1 * altura) - (4.3 * idade)

                println("Considerando a sua rotina de exercícios físicos:")
                println("--------------------------------------------")

                val nenhum = tmb * 1.2
                println("Nenhuma atividade física: %.2f".format(nenhum))
                println("--------------------------------------------")

                val moderada = tmb * 1.55
                println("Atividade física moderada: %.2f".format(moderada))
                println("meia hora de caminhada, natação ou bicicleta, quatro vezes por semana")

                println("--------------------------------------------")

                val intenso = tmb * 1.9
                println("Atividade física intensa: %.2f".format(intenso))
                println("uma hora de corrida, pelo menos quatro vezes por semana")

                println("--------------------------------------------")
            }

        } else if (opcao == "3") {
            println("digite o nome do exercicio")
             val ex = readLine()!!
            print("Peso antigo: ")
            val antigo = readLine()!!.toDouble()

            print("Peso atual: ")
            val atual = readLine()!!.toDouble()

            val pr = atual - antigo

            if (pr > 0) {
                println("voce progrediu $pr kg")
            } else {
                println("voce regrediu $pr kg")
            }

        } else if (opcao == "4") {

            println("--------------------------------------------")
            if (seg == "") {
                println("cronograma nao criado")
            } else {
                println("\nSeu cronograma:")
                println("Segunda: $seg")
                println("Terça: $ter")
                println("Quarta: $qua")
                println("Quinta: $qui")
                println("Sexta: $sex")
            }
            println("--------------------------------------------")
        } else if (opcao == "5") {

            println("Saindo!!! Happy fitness agradece ♡♡♡")
            break

        } else {
            println("Opção inválida")
        }
    }
}