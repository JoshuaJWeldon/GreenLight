<!DOCTYPE html>
<html>
    <body>
        
        <h2 style="color:blue; text-align:center"> Database Test</h2>
        
        <?php
            $servername = "173.194.252.106";
            $username = "root";
            $password = "StrongHtr&7";
            
            // Create connection
            $conn = new mysqli($servername, $username, $password);
            
            // Check connection
            if ($conn->connect_error) {
                die("Connection failed: " . $conn->connect_error);
            } 
            echo "Connected successfully <br>";
            
            $sql = "use greenlight";
            $conn->query($sql);
            
            $sql = "SELECT * FROM users";
            $result = $conn->query($sql);
            
            echo "SELECT * FROM users <br>";
            
            if ($result->num_rows > 0) {
                // output data of each row
                while($row = $result->fetch_assoc()) {
                    echo "-ID: " . $row["id"] . " -NAME: " . $row["firstname"]. " " . $row["lastname"] . "-PHONE#: " . $row["phone"] . "<br>";
                }
            } else {
                echo "0 results";
            }
            $conn->close();
            
        ?>
        
    </body>
</html>  

