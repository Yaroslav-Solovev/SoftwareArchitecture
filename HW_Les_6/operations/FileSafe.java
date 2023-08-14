// package HW_Les_6.operations;

// import java.io.FileWriter;
// import java.io.IOException;
// import java.text.ParseException;
// import java.util.ArrayList;

// import HWork_3.Core.Data.Base;

// public class FileSafe {
    
//     public static AddBook addPeople = new AddBook();
     	 
//     public static void fileSafe() throws ParseException, Exception{
//         String fileName = "HWork_3/Save/file.txt";
//         ArrayList<Base> allPeople = addPeople.getArrayPeople();
//         for (int i = 0; i < allPeople.size(); i++) { //** Присваивание файлу названия ввиде фамилии человека */
//             fileName = fileName.replace("file", allPeople.get(i).getSurname()); 
//         }

//         try (FileWriter file = new FileWriter(fileName, true)) { //** Запись данных в файл о человеке + с функцией дозаписи вслучае одинаковых фамилий */
//             for (int i = 0; i < allPeople.size(); i++) { 
//                 file.append(allPeople.get(i).getInfo());
//                 file.append('\n');
//             }
//             file.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     } 
// }
