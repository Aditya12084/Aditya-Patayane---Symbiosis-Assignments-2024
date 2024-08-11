let counter = 0;

function addElementsToDiv() {
  counter++;
  var externalDiv = document.getElementById("container");

  var i = document.createElement("input");

  i.name = "username";
  i.type = "text";
  i.value = counter;

  var b = document.createElement("button");
  b.name = "button1";
  b.innerText = "remove button" + counter;

  b.addEventListener("click", function (e) {
    var currentDiv = e.target.parentElement;
    externalDiv.removeChild(currentDiv);
  });

  var internalDiv = document.createElement("div");

  internalDiv.appendChild(i);
  internalDiv.appendChild(b);

  externalDiv.appendChild(internalDiv);
}
