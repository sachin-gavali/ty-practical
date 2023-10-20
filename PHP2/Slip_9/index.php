<!DOCTYPE html>
<html lang="en">

<head>
   <meta charset="UTF-8">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>Form</title>
   <style>
      textarea,
      select {
         padding: 10px 30px;
         margin: 20px;
      }
   </style>
</head>

<body>
   <form action="" method="post">
      Example value: <textarea cols="40" rows="3" name="string">  </textarea>
      <select name="select">
         <option value="@"> @ </option>
         <option value="#"> # </option>
         <option value="%"> % </option>
         <option value="&"> & </option>
      </select>
      <input name="submit" type="submit" />
   </form>
   <div>
      <h1> Ans </h1>
      <?php
      if (isset($_POST['submit'])) {
         $str = $_POST['string'];
         $separator = $_POST['select'];
         echo " Separator  = ", $separator;
         $new = explode($_POST['select'], $str);
         echo " <br> Split String into Separate words using the Separator  <br> ";
         print_r($new);

         // replace separator 
         $newSeparator = "@";
         echo " <br> Repalce Separator  <br> ";
         $new2 = str_replace($separator, $newSeparator, $str);
         print_r($new2);
         // last word in string
         $len = strlen($str);
         $words = str_word_count($str, 1);
         $last = end($words);
         echo " <br> Last word  <br> ";
         echo "\n last word is = ", $last;
      }
      ?>
   </div>
</body>

</html>