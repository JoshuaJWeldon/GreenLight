<!DOCTYPE html>
<html>
    <body>
        
        <h2 style="color:blue; text-align:center"> Database Test</h2>
        
        <?php
            $servername = "//54.148.210.217:1521/ORCL";
            $username = "root";
            $password = "StrongHtr&7";
            
            // Create connection
            $conn = new oci_connect($username, $password, $servername);
            
            // Check connection
            if (!$conn) {
                die("Connection failed ");
            } 
            echo "Connected successfully <br>";
            
             
            
        ?>
        
    </body>
</html>  

