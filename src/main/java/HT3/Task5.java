package HT3;

public class Task5 {
    public static void main(String[] args) {
int array[]={5,6,7,12,-5,32,43,6,12}, a,b,k=0,duplicates[];
//переменная для того чтоб не записывать множественные дубликаты в масив дубликатов
boolean haveIFoundSameDuplicate = false;
//указываем половину т.к. факсически не возможно получить более чем половину массива состоящего из дубликтов от любого оригинала
duplicates = new int[array.length/2];
// цикл в цикле для сравнения всех чисел
for(int i=0;i<array.length-1;i++ ){
    for(int j=i+1 ;j<array.length;j++ ) {
        a=array[i];
        b=array[j];
//условие находки дубликата
        if(a==b){
            haveIFoundSameDuplicate= false;
// проверяем есть ли запись о таком дубликате уже в массиве, если есть то пропускаем его
            for(int l=0;l< duplicates.length;l++)
            {
                if(duplicates[l]==a){haveIFoundSameDuplicate=true; break;}
            }
//добавляем дубликат в массив
            if(!haveIFoundSameDuplicate){
            duplicates[k]=a;
            k++;}
        }
    }
}
//вывод записей дубликатов которые были найдены
for(int i=0;i< k;i++){
    if(i<k-1)      System.out.print(duplicates[i]+",");
    else           System.out.print(duplicates[i]);
        }
    }
}


