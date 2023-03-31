import React from "react";
import { Container, Row, Col } from "react-bootstrap";
import ProjectCard from "./ProjectCards";
import Particle from "../Particle";
import leaf from "../../Assets/Projects/leaf.png";
import emotion from "../../Assets/Projects/emotion.png";
import editor from "../../Assets/Projects/codeEditor.png";
import chatify from "../../Assets/Projects/chatify.png";
import suicide from "../../Assets/Projects/suicide.png";
import bitsOfCode from "../../Assets/Projects/blog.png";

function Projects() {
  return (
    <Container fluid className="project-section">
      <Particle />
      <Container>
        <h1 className="project-heading">
          My Recent <strong className="purple">Works </strong>
        </h1>
        <p style={{ color: "white" }}>
          Here are a few projects I've worked on recently.
        </p>
        <Row style={{ justifyContent: "center", paddingBottom: "10px" }}>
          <Col md={4} className="project-card">
            <ProjectCard
              imgPath={chatify}
              isBlog={false}
              title="Web Development"
              description="This one-to-one relationship interaction is intended to identify and address the issues of students (mentees) to enhance their academic and personal potential in the early career stage."
              ghLink=""
              demoLink=""
            />
          </Col>

          <Col md={4} className="project-card">
            <ProjectCard
              imgPath={bitsOfCode}
              isBlog={false}
              title="File Structure Using C++"
              description="Use a custom search function to search the list of random numbers. This search function should only work on sorted lists of numbers."
              ghLink=""
              demoLink=""
            />
          </Col>

          <Col md={4} className="project-card">
            <ProjectCard
              imgPath={editor}
              isBlog={false}
              title="Mobile Application Development"
              description="The application allows the user to store pill objects and multiple alarms for those pills. Alarms have one time of day and can occur on multiple days of the week. The user is able to view their pills in a today view and can select date to view medicines."
              ghLink=""
              demoLink=""              
            />
          </Col>

          

         

         
        </Row>
      </Container>
    </Container>
  );
}

export default Projects;
