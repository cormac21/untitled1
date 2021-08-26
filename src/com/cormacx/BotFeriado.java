package com.cormacx;

public class BotFeriado {

    public String processaFeriadoWord(String texto) {

        if (texto == null)

            return "É preciso informar um texto";

        texto = texto.toUpperCase();

        if (texto.contains("FERIADO")) {  //regex

            if (texto.contains("MUNDIAL DO TRABALHO")) {
                return "O dia Mundial do trabalho é comemorado em 01 de maio";
            }

            if (texto.contains("CORPUS CHRISTI")) {
                return "O dia de Corpus Christi é comemorado em 03 de Junho";
            }

            if (texto.contains("INDEPENDÊNCIA DO BRASIL")) {
                return "O dia da Independência é comemorado em 07 de setembro";
            }

            return "De acordo com JavaPedia encontramos algumas informações que podem ser uteis" +
                    "" +
                    "Mês\tDia\tComemoração\n" +
                    "Maio\t01\tDia Mundial do Trabalho (feriado nacional)\n" +
                    "Junho\t03\tCorpus Christi (Ponto Facultativo)\n" +
                    "Setembro\t07\tIndependência do Brasil (feriado nacional)\n" +
                    "Outubro\t12\tNossa Senhora Aparecida (feriado nacional)";
        }

        return "Nenhuma resposta foi encontrada para a palavra informada";

    }

}
