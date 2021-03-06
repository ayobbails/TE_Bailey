const name = 'Cigar Parties for Dummies';
let description = 'Host and plan the perfect cigar party for all of your squirrelly friends.';
let reviews = [
  {
    reviewer: 'Malcolm Gladwell',
    title: 'What a book!',
    review:
      "It certainly is a book. I mean, I can see that. Pages kept together with glue (I hope that's glue) and there's writing on it, in some language.",
    rating: 3
  }
];

/**
 * Add our product name to the page title
 * Get our page page title by the id and the query the .name selector
 * once you have the element you can add the product name to the span.
 */
function setPageTitle() {
  const pageTitle = document.getElementById('page-title');
  pageTitle.querySelector('.name').innerText = name;
}

/**
 * Add our product description to the page.
 */
function setPageDescription() {
  document.querySelector('.description').innerText = description;
}

/**
 * I will display all of the reviews in the reviews array
 */
function displayReviews() {
  if ('content' in document.createElement('template')) {
    reviews.forEach((review) => {
      displayReview(review);
    });
  } else {
    console.error('Your browser does not support templates');
  }
}

/**
 *
 * @param {Object} review The review to display
 */
// Code to add a review to the DOM from the array of reviews in this JavaScript
// 
function displayReview(review) { // Receiving an array of review objects as a parameter
  const main = document.getElementById('main');
  const tmpl = document.getElementById('review-template').content.cloneNode(true);
  tmpl.querySelector('h4').innerText = review.reviewer;  // Find the h4 element in the template and set its text to reviewer 
  tmpl.querySelector('h3').innerText = review.title;     // Find the h3 element in the template and set its text to tile
  tmpl.querySelector ('p').innerText = review.review;    // Find the p element in the template and set its text to review
  // there will always be 1 star because it is a part of the template
  for (let i = 1; i < review.rating; i++) {
    const img = tmpl.querySelector('img').cloneNode();   // Copy the template img element
    tmpl.querySelector('.rating').appendChild(img);      // find the element with class='rating' and add the img tag
  }
  main.appendChild(tmpl);                                // Add the elements in the template to the page
}
/*********************************************************************************************************************************/
// LECTURE STARTS HERE -----------------------------------------------------------------------------------------------------------

// Wait to run the DOM manipulation functions until we are sure the DOM was created successfully
// add a DOMContentLoaded event listener to the document
                      
                       //(event-to-listen-for, event-handler-function)
document.addEventListener('DOMContentLoaded',  () => { // When the DOM is fully created run the anonymous function
                                                      setPageTitle();       // set the product reviews page title
                                                      setPageDescription(); // set the product reviews page description
                                                      displayReviews();     // display all of the product reviews on our page
                                                      })

/**
 * Take an event on the description and swap out the description for a text box.
 *
 * @param {Event} event the event object
 */
const desc  = document.querySelector('.description'); // Get a reference to element with class='description'
desc.addEventListener('click', (event) => {
  toggleDescriptionEdit(event.target); // Call the function to show the input box passing it the element that fired the event
})                                     // (the description on the page)

const inputDesc = document.getElementById('inputDesc'); // Get a reference to the input box for new description
inputDesc.addEventListener('keyup', (event) => {        // When the user releases the key in the input box
    
  if(event.key === 'Enter') {                   // If the user pressed the Enter key
      exitDescriptionEdit(event.target, true)   // Call the function to exit the box telling it to save the input
    }
    if (event.key === 'Escape') {               // If the user pressed Escape key
      exitDescriptionEdit(event.target, false)  // Call the function to exit the box telling it to NOT save the input 
    }
  })

  // Show/Hide form when Add Review is clicked
  const btnToggleForm = document.getElementById('btnToggleForm'); // Get a reference to the add review button
  btnToggleForm.addEventListener('click', (event) => {
    showHideForm();   // run method to show/hide form
  })

  const btnSaveReview = Document.getElementById('btnSaveReview'); // Get a reference to the Save Review button
    btnSaveReview.addEventListener('click', (event) => {
      event.preventDefault();
      saveReview(); // run the function to save the review in our data source (array in the code)
    })



// This will "toggle the input box editing"
// if pass this function the element with class='description' the next sibling is the input box we want to use to enter the new description
function toggleDescriptionEdit(desc) {     // Receive an element from the HTML
              const textBox = desc.nextElementSibling; // Get a reference to the next sibling of the element passed
              textBox.value = description;             // Initialize the textBox to the original description
              //     .classList represents the set of classes assigned to an element - whats in class= for an element
              textBox.classList.remove('d-none');      // Change the class of the textBox so it displays
              desc.classList.add('d-none');            // Add the class to element passed to hide it
              textBox.focus();                         // Put the cursor in the textBox
}
/*
 * Take an event on the text box and set the description to the contents
 * of the text box and then hide the text box and show the description.
 *
 * @param {Event} event the event object
 * @param {Boolean} save should we save the description text
 */
//
//  Function will save the new description entered by the user
//
function exitDescriptionEdit(textBox, save) { // Receive the element with the new description
  let desc = textBox.previousElementSibling;  // get reference to textBox's previous sibling
  if (save) {                                 // if the request was to save
    desc.innerText = textBox.value;           // copy the data from the textBox to its previous sibling
  }
  textBox.classList.add('d-none');            // Hide the textBox passed to us
  desc.classList.remove('d-none');            // Show the previous sibling
}

/**
 * I will show / hide the add review form
 */
function showHideForm() {
  const form = document.querySelector('form');
  const btn = document.getElementById('btnToggleForm');

  if (form.classList.contains('d-none')) {   // If the form is hidden
    form.classList.remove('d-none');         //   show it
    btn.innerText = 'Hide Form';             //   change button text
    document.getElementById('name').focus(); //   put the cursor in the form id='name'
  } else {                                   // if the form is not hidden (it's showing)
    resetFormValues();                       //   call the function to reset the values
    form.classList.add('d-none');            //   hide it
    btn.innerText = 'Add Review';            //   change the button text
  }
}

/**
 * I will reset all of the values in the form.
 */
function resetFormValues() {                      // Reset the form fields to default values
  const form = document.querySelector('form');
  const inputs = form.querySelectorAll('input');  // Get references to all input controls and put in an array
  inputs.forEach((input) => {                     // Loop through the array of input fields
    input.value = '';                             //    setting them to empty
  });
  document.getElementById('rating').value = 1;
  document.getElementById('review').value = '';
}

/**
 * I will save the review that was added using the add review from
 */
function saveReview() { // Save the data from the form into an object and add object to our array
  
  const name = document.getElementById  ('name');   // Get a reference to name field in the form
  const title = document.getElementById ('title');  // Get a reference to title field in the form
  const rating = document.getElementById('rating'); // Get a reference to rating field in the form
  const review = document.getElementById('review'); // Get a reference to review field in the form

  const newReview= { // new object to add to array with form data
    reviewer: name.value,   // assign data from name into form to reviewer
    title:    title.value,
    rating:   rating.value,
    review:   review.value
  }
  reviews.push(newReview);    // Add the newReview to our array
  displayReview(newReview);   // Call function to add the review to the page
  showHideForm();             // Hide the form
}
