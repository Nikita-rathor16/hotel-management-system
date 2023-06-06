<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<c:forEach var="room" items="rooms">  

</c:forEach>

<style>
    body{

        background-image: url('https://thumbs.dreamstime.com/z/hotel-management-concept-network-blue-background-50184655.jpg');
    }
.thumbnail{
    border: 2px solid black;
   
}

.choosecolor{
    color: brown;
}
   
</style>
<body>

<div class="container">
  <h2> <b>Your Rooms</b></h2>
  
  <div class="row">
    <div class="col-md-3">
        <div  class="choosecolor" >AC ROOMS</div>
      <div class="thumbnail">
        
          <img src="https://www.hotelcomfortbangalore.com/mobile/images/rooms/executive-ac-room.jpg" alt="Lights" style="width:100%">
          <div class="caption">
            <p>The AC Room has a sophisticated setup. We provide king-size or twin beds according to the choice of the guest. Beautiful decor and standard amenities come together to make this room a desirable one</p>
            <a type="button" class="btn btn-warning" target="_blank" href="acrooms"  style="float: right;">View Details</a>
            <p style="color: brown;"><b>₹1000</b></p>
          </div>
        </a>
      </div>
    </div>
    <div class="col-md-3">
        <div class="choosecolor">NON-AC ROOMS</div>
      <div class="thumbnail">
       
          <img src="https://www.daikin.com/-/media/Project/Daikin/daikin_com/products/ac/applications/modals/10_hotels/images/pic_01-jpg.jpg?rev=-1&hash=5C153B977FFE19DF6145AD65870751FB" alt="Lights" style="width:100%">
          <div class="caption">
            <p>This rooms are at the front side and are having a fantastic valley view and . 2 guests are allowed but 1 extra person can be allowed at an extra cost with complete bedding , mattress on the floor will be provided</p>
            <a type="button" class="btn btn-success" target="_blank" href="nonac"  style="float: right; ">View Details</a>
            <p style="color: brown;"><b>₹800</b></p>
          </div>
        </a>
      </div>
    </div>
    <div class="col-md-3">
        <div  class="choosecolor">Deluxe</div>
      <div class="thumbnail">
       
          <img src="https://www.oberoihotels.com/-/media/oberoi-hotels/website-images/the-oberoi-new-delhi/room-and-suites/deluxe-room/detail/deluxe-room-1.jpg" alt="Lights" style="width:100%" >
          <div class="caption">
            <p>Spacious rooms for a delightful stay and that too at a reasonable rate. These rooms are provided with various amenities and designed specially to offer a pleasurable stay. And guests will feel comfortable and more reliable.</p>
           <a type="button" class="btn btn-danger" target="_blank" href="deluxe"  style="float: right;">View Details</a>
           <p style="color: brown;"><b>₹1500</b></p>
          </div>
        </a>
      </div>
    </div>
    <div class="col-md-3">
        <div  class="choosecolor">SUPER DELUXE</div>
      <div class="thumbnail">
        
          <img src="https://www.mhotel.in/img/super/01.jpg" alt="Nature" style="width:100%">
          <div class="caption">
            <p>This is the smallest room in the hotel with  all the basic amenities like L.E.D , set top box , attached toilets with individual geyser for hot and cold water , free access to WiFi . Toiletries :- Bathing soap and towels only.</p>
            <a type="button" class="btn btn-primary" target="_blank" href="superdeluxe" style="float: right;">View Details</a>


            <p style="color: brown;"><b>₹1800</b></p>
            <!-- <div class="mt-2 mb-1"><span class="fs-4 c-neutral-900 fw-700 flex flex-middle"><span class="td-line-through mr-2 c-neutral-500 fw-500 fs-2"></span>₹5,849</span></div> -->
          </div>
          
        
      </div>
      
    </div>
    <br>
    
  </div>
</div>

</body>
</html>