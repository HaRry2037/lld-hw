package com.bunny.design.Builder;

public class Driver {
   public static void main(String[] main){
       Query query = new Query();



        QueryBuilder queryBuilder= new QueryBuilder()
                .select("SELECT x,y,z" )
                .from(" from table ")
                .groupby(" group by y,z ")
                .orderby(" order by y,z ");
        Query query1= queryBuilder.build();
       System.out.println(query1.getQuery());

   }
}
