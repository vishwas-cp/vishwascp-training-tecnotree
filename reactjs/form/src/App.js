// import logo from './logo.svg';
 import './App.css';

function App() {
  return (
    <div className="App">
      


      <form action="index.html" method="post">
      
      <h1>Sign Up</h1>
      
      <fieldset>
        <legend><span class="number">1</span>Your basic info</legend>
        <label for="name">Name:</label>
        <input type="text" id="name" name="user_name"></input>
        
        <label for="mail">Email:</label>
        <input type="email" id="mail" name="user_email"></input>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="user_password"></input>
        
        <label>Age:</label>
        <input type="radio" id="under_13" value="under_13" name="user_age"></input><label for="under_13" class="light">Under 18</label><br></br>
        <input type="radio" id="over_13" value="over_13" name="user_age"></input><label for="over_13" class="light">18 or older</label>
      </fieldset>
      
      <fieldset>
        <legend><span class="number">2</span>Your profile</legend>
        <label for="bio">Biography:</label>
        <textarea id="bio" name="user_bio"></textarea>
      </fieldset>
      <fieldset>
      <label for="job">Job Role:</label>
      <select id="job" name="user_job">
        <optgroup label="Web">
          <option value="frontend_developer">Front-End Developer</option>
          <option value="php_developor">PHP Developer</option>
          <option value="python_developer">Python Developer</option>
          <option value="rails_developer"> Rails Developer</option>
          <option value="web_designer">Web Designer</option>
          <option value="WordPress_developer">WordPress Developer</option>
        </optgroup>
        <optgroup label="Mobile">
          <option value="Android_developer">Androild Developer</option>
          <option value="iOS_developer">iOS Developer</option>
          <option value="mobile_designer">Mobile Designer</option>
        </optgroup>
        <optgroup label="Business">
          <option value="business_owner">Business Owner</option>
          <option value="freelancer">Freelancer</option>
        </optgroup>
        <optgroup label="Other">
          <option value="secretary">Secretary</option>
          <option value="maintenance">Maintenance</option>
        </optgroup>
      </select>
      
        <label>Interests:</label>
        <input type="checkbox" id="development" value="interest_development" name="user_interest"></input><label class="light" for="development">Development</label><br></br>
          <input type="checkbox" id="design" value="interest_design" name="user_interest"></input><label class="light" for="design">Design</label><br></br>
        <input type="checkbox" id="business" value="interest_business" name="user_interest"></input><label class="light" for="business">Business</label>
      
      </fieldset>
      <button type="submit">Sign Up</button>
    </form>





    </div>
  );
}

export default App;
