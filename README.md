# Tópicos especiais em Java : data-hora

## Data 

- Data Local: não considera fuso horário
- Data-hora global: quando o momento exato interessa a pessoas de outro fuso horário.

<br/>
<br/>

## Timezone

- GMT/UTC/Z - Horário de Londres (padrão)
- Outros fuso horários são relativos ao UTC:
  - SP - GMT-3
  - Manaus - GMT-4
  - Portugal - GMT+1
- muitas tecnologias/linguagens usam nomes para identificar os timezones 
  - US/Pacific
  - America/Sao_Paulo

<br/>
<br/>

## Padrão ISO 8601

Regras para representação de data

- Data-[hora] local:
  - 2022-07-21
  - 2022-07-21T14:52
  - 2022-07-22T14:52:09
  - 2022-07-22T14:52:09.4073
- Data-hora global:
  - 2022-07-23T14:52:09Z
  - 2022-07-23T14:52:09.254935Z
  - 2022-07-23T14:52:09-03:00

<br/>
<br/>

## Operações importantes com data-hora

- Instanciação
  - (agora) ➞ Data-hora
  - Texto ISO 8601 ➞ Data-hora
  - Texto formato customizado ➞ Data-hora
  - dia, mês, ano, [horário] ➞ Data-hora local 
- Formatação
  - Data-hora ➞ Texto ISO 8601
  - Data-hora ➞ Texto formato customizado
- Converter data-hora global para local 
  - Data-hora global, timezone (sistema local) ➞Data-hora local 
- Obter dados de uma data-hora local 
  - Data-hora local ➞ dia, mês, ano, horário
- Cálculos com data-hora
  - Data-hora +/- tempo ➞ Data-hora
  - Data-hora 1, Data-hora 2 ➞ Duração


<br/>
<br/>

##  Principais tipos Java (versão 8+) • Data-hora local
- LocalDate
- LocalDateTime
- Data-hora global
  - Instant
- Duração
  - Duration
- Outros
  - ZoneId
  - ChronoUnit


```java
  // Instanciação
  // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
  DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
  DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
  
  LocalDate d01 = LocalDate.now();
  LocalDateTime d02 = LocalDateTime.now();
  Instant d03 = Instant.now();
  
  LocalDate d04 = LocalDate.parse("2022-07-20");
  LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
  Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
  Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
  
  // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
  LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
  LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

  LocalDate d10 = LocalDate.of(2022, 07, 20);
  LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);
  
  System.out.println("d01 = " + d01.toString());
  System.out.println("d02 = " + d02.toString());
  System.out.println("d03 = " + d03.toString());
  System.out.println("d04 = " + d04.toString());
  System.out.println("d05 = " + d05.toString());
  System.out.println("d06 = " + d06.toString());
  System.out.println("d07 = " + d07.toString());
  System.out.println("d08 = " + d08.toString());
  System.out.println("d09 = " + d09.toString());
  System.out.println("d10 = " + d10.toString());
  System.out.println("d11 = " + d11.toString());
```

```java
  // Formatação
  LocalDate d04 = LocalDate.parse("2022-07-20");
  LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
  Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

  // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
  DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
  DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
  DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
  DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
  DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

  System.out.println("d04 = " + d04.format(fmt1));
  System.out.println("d04 = " + fmt1.format(d04));
  System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

  System.out.println("d05 = " + d05.format(fmt1));
  System.out.println("d05 = " + d05.format(fmt2));
  System.out.println("d05 = " + d05.format(fmt4));

  System.out.println("d06 = " + fmt3.format(d06));
  System.out.println("d06 = " + fmt5.format(d06));
  System.out.println("d06 = " + d06.toString());
```
```java
  // convertendo data/hora global para local
  // for (String s : ZoneId.getAvailableZoneIds())
  // System.out.println(s);

  LocalDate d04 = LocalDate.parse("2022-07-20");
  LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
  Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

  LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
  LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
  LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
  LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

  System.out.println("r1 = " + r1);
  System.out.println("r2 = " + r2);
  System.out.println("r3 = " + r3);
  System.out.println("r4 = " + r4);

  System.out.println("d04 dia = " + d04.getDayOfMonth());
  System.out.println("d04 mês = " + d04.getMonthValue());
  System.out.println("d04 ano = " + d04.getYear());

  System.out.println("d05 hora = " + d05.getHour());
  System.out.println("d05 minutos = " + d05.getMinute());
```
```java
  // Cálculos com data e hora
  LocalDate d04 = LocalDate.parse("2022-07-20");
  LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
  Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

  LocalDate pastWeekDate = d04.minusDays(7);
  LocalDate nextWeekDate = d04.plusDays(7);

  LocalDateTime pastWeekLocalDate = d05.minusDays(7);
  LocalDateTime nextWeekLocalDate = d05.plusDays(7);

  Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
  Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

  System.out.println("pastWeekDate = " + pastWeekDate);
  System.out.println("nextWeekDate = " + nextWeekDate);

  System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
  System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

  System.out.println("pastWeekInstant = " + pastWeekInstant);
  System.out.println("nextWeekInstant = " + nextWeekInstant);

  Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), d04.atStartOfDay());
  Duration t2 = Duration.between(pastWeekLocalDate, d05);
  Duration t3 = Duration.between(pastWeekInstant, d06);
  Duration t4 = Duration.between(d06, pastWeekInstant);

  System.out.println("t1 dias = " + t1.toDays());
  System.out.println("t2 dias = " + t2.toDays());
  System.out.println("t3 dias = " + t3.toDays());
  System.out.println("t4 dias = " + t4.toDays());
```