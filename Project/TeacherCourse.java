package com.example.clearmydoubt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class TeacherCourse extends AppCompatActivity {

    Button button;private String fyComp[] = {"Engnieering Mathematics 1\n" +
            "Physics-1\n" +
            "Chemistry-1\n" +
            "Basic Electrical & Electronics Engg. 1\n" +
            "Fundamentals of Programming Language 1\n" +
            "Engg. Graphics\n" +
            "Environmental studies\n","Engnieering Mathematics 2\n" +
            "Physics-2\n" +
            "Chemistry-2\n" +
            "Basic Electrical & Electronics Engg. 2\n" +
            "Fundamentals of Programming Language 2\n" +
            "Engg. Mechanics"};
    private String syComp[] = {"Principles of Programming Language\n" +
            "Data Structures & Algorithms 1\n" +
            "Digital Systems & Computer Organization\n" +
            "Discrete Mathematics\n" +
            "Principles of Finance & Economics","Operating Systems\n" +
            "Data Structures & Algorithms 2\n" +
            "Microprocessor Architectures\n" +
            "Fundamentals of Computer Networks\n" +
            "Enggnieering Mathematics 3"};
    private String tyComp[] = {"Design & Analysis of Algorithms\n" +
            "Computer networks\n" +
            "Statistics for Computer Science\n" +
            "Cloud Computing\n" +
            "Database Management Systems\n" +
            "Digital Marketing\n" +
            "Project management\n" +
            "EDP\n" +
            "Intellectual Property Rights\n" +
            "Programming skill development\n","Theory of Computation\n" +
            "Artificial intelligence & Machine Learning\n" +
            "Software Design & Architecture\n" +
            "Data mining & warehousing\n" +
            "Embedded & Real-time systems\n" +
            "Image Processing\n" +
            "Linux Internals\n" +
            "Human Computer Interaction\n" +
            "Software testing and quality assurance\n" +
            "Multimedia Systems\n" +
            "Wireless and Mobile communication\n" +
            "Swayam online courses"};
    private String bTechComp[] = {"Internet of Things\n" +
            "Software Engineering\n" +
            "Organizational Behavior\n" +
            "Soft Computing\n" +
            "Computer graphics\n" +
            "Introduction to Cyber Crime and Forensics\n" +
            "Project Phase 1","Network and Information Security\n" +
            "Project Phase 2\n" +
            "e-Business\n" +
            "Big data and Analytics\n" +
            "Introduction to Natural Language Processing\n" +
            "Parallel Computing\n" +
            "Compiler Construction\n" +
            "Java Full Stack technologies\n" +
            "Deep learning\n"};
    private String fyENTC[] = {"Engnieering Mathematics 1\n" +
            "Physics-1\n" +
            "Chemistry-1\n" +
            "Basic Electrical & Electronics Engg. 1\n" +
            "Fundamentals of Programming Language 1\n" +
            "Engg. Graphics\n" +
            "Environmental studies\n","Engnieering Mathematics 2\n" +
            "Physics-2\n" +
            "Chemistry-2\n" +
            "Basic Electrical & Electronics Engg. 2\n" +
            "Fundamentals of Programming Language 2\n" +
            "Engg. Mechanics"};
    private String syENTC[] = {"Electronic devices and circuit\n" +
            "Network theory\n" +
            "Digital electronics \n" +
            "Data structures\n" +
            "Engineering mathematics 3",
            "Signals & systems\n" +
                    "Object oriented programming\n" +
                    "Analog communication\n" +
                    "Integrated circuits and applications\n" +
                    "Principal of economics and finance"};
    private String tyENTC[] = {"Digital communications\n" +
            "Microcontrollers\n" +
            "Electromagnetic theory\n" +
            "Intellectual property rights\n" +
            "Project management\n" +
            "Entrepreneurship development\n" +
            "Digital Marketing\n" +
            "Mechatronics\n" +
            "Power electronics\n" +
            "System programming & Operating Systems\n" +
            "Probability and Statiscs\n",
            "Digital Signal processing\n" +
                    "Advance processors\n" +
                    "Control systems\n" +
                    "PLC & Automation\n" +
                    "Biomedical electronics\n" +
                    "Information theory and coding techniques\n" +
                    "Swayam online courses\n" +
                    "Artificial intelligence\n" +
                    "Embedded design and RTOS\n" +
                    "Robotics\n" +
                    "Digital image processing\n" +
                    "Antenna & Wave propogation"};
    private String bTechENTC[] = {"VLSI\n" +
            "Computer Networks for security\n" +
            "Management for engineers\n" +
            "Digital video processing\n" +
            "Project Phase 1\n" +
            "Electronic product design\n" +
            "Television and audio engineering","Broadband communication systems\n" +
            "Advance DSP\n" +
            "Microwave and radar engineering\n" +
            "Mobile communication\n" +
            "Computer vision\n" +
            "Automative electronics"};
    private String fyMechanical[] = {"Engnieering Mathematics 1\n" +
            "Physics-1\n" +
            "Chemistry-1\n" +
            "Basic Electrical & Electronics Engg. 1\n" +
            "Fundamentals of Programming Language 1\n" +
            "Engg. Graphics\n" +
            "Environmental studies\n","Engnieering Mathematics 2\n" +
            "Physics-2\n" +
            "Chemistry-2\n" +
            "Basic Electrical & Electronics Engg. 2\n" +
            "Fundamentals of Programming Language 2\n" +
            "Engg. Mechanics"};
    private String syMechanical[] = {"Engineering thermodynamics",
            "Materials technology 1",
            "Manufacturing process 1",
            "Machine drawing",
            "Electrical and Electronics Enggnieering",
            "Principles of economics and finance",
            "Engineering mathematics 3",
            "Strength of materials",
            "Fluid mechanics",
            "Manufacturing process 2",
            "Rigid body dyanamics",
            "Materials technology 2"
    };
    private String tyMechanical[] = {"Computer oriented numerical Methods",
            "Analysis and synthesis of mechanisms",
            "Heat transfer",
            "Entrepreneurship development",
            "Intellectual Property Rights",
            "Digital Marketing",
            "Project management",
            "Automation and control Enggnieering",
            "Tool Engineering",
            "Advance Fluid Mechanics",
            "Non-destructive Evaluation and Testing",
            "Applied thermodynamics",
            "Machine Design",
            "Metrology and quality control",
            "Machines and mechanisms",
            "Gas turbine",
            "Press tool design",
            "Swayam online courses",
            "Nanotechnology",
            "Piping Enggnieering",
            "Jig and Fixture Design",
            "Mechanics of composite materials",
            "Computational fluid dyanamics"
    };
    private String bTechMechanical[] = {"CAD/CAM and Automation",
            "Transmission System Design",
            "Economics for Engineers",
            "Open elective",
            "Project Phase 1",
            "Turbo machines",
            "Open Elective 2",
            "Project Phase 2",
            "Mechanical Vibration",
            "Refrigeration And air conditioning",
            "Advance manufacturing processes",
            "Energy storage and management"};
    private String fyIT[] = {"Engnieering Mathematics 1\n" +
            "Physics-1\n" +
            "Chemistry-1\n" +
            "Basic Electrical & Electronics Engg. 1\n" +
            "Fundamentals of Programming Language 1\n" +
            "Engg. Graphics\n" +
            "Environmental studies\n","Engnieering Mathematics 2\n" +
            "Physics-2\n" +
            "Chemistry-2\n" +
            "Basic Electrical & Electronics Engg. 2\n" +
            "Fundamentals of Programming Language 2\n" +
            "Engg. Mechanics"};
    private String syIT[] = {"Discrete structures\n" +
            "Data structures 1\n" +
            "Digital Systems\n" +
            "Network Fundamentals\n" +
            "Principles of economics and finance","Data structures 2\n" +
            "Computer Networks\n" +
            "Computer organisations and architecture\n" +
            "Object oriented paradigms\n" +
            "Engineering mathematics 3"};
    private String tyIT[] = {"Database Management Systems\n" +
            "Theory of Computations\n" +
            "Machine learning\n" +
            "Entrepreneurship development\n" +
            "Digital Marketing\n" +
            "Computer graphics & animation\n" +
            "Artificial intelligence\n" +
            "Project management\n" +
            "Intellectual Property Rights\n" +
            "Business intelligence\n" +
            "Object oriented modelling and design","Design and analysis of Algorithms\n" +
            "Operating systems\n" +
            "Software Engineering\n" +
            "Advance Computer networks\n" +
            "Swayam online courses\n" +
            "Human Computer Interaction\n" +
            "Advance Computer architecture\n" +
            "Multimedia computing\n" +
            "Natural Language processing\n" +
            "Advanced machine learning\n" +
            "Systems programming"};
    private String bTechIT[] = {"Software architecture and design patterns\n" +
            "Green computing\n" +
            "Cloud Computing\n" +
            "Project Phase 1","Information and cyber security\n" +
            "Internet of things\n" +
            "Software defined networks\n" +
            "Information retrieval\n" +
            "Principles of compiler design"};
    private String fyInstrunmentation[] = {"Engnieering Mathematics 1\n" +
            "Physics-1\n" +
            "Chemistry-1\n" +
            "Basic Electrical & Electronics Engg. 1\n" +
            "Fundamentals of Programming Language 1\n" +
            "Engg. Graphics\n" +
            "Environmental studies\n","Engnieering Mathematics 2\n" +
            "Physics-2\n" +
            "Chemistry-2\n" +
            "Basic Electrical & Electronics Engg. 2\n" +
            "Fundamentals of Programming Language 2\n" +
            "Engg. Mechanics"};
    private String syInstrunmentation[] = {"Sensors and transducers\n" +
            "Basic instrumentation\n" +
            "Linear integrated circuits\n" +
            "Digital techniques\n" +
            "Engineering mathematics 3","Sensors and transducers 2\n" +
            "Electronic instrumentation and system design\n" +
            "Analytical instrumentation\n" +
            "Control systems 1\n" +
            "Principles of economics and finance"};
    private String tyInstrunmentation[] = {"Embedded systems design\n" +
            "Control systems 2\n" +
            "Control system components\n" +
            "Fundamentals of biomedical instrumentation\n" +
            "Instrumentation\n" +
            "Power electronics and drives\n" +
            "Mechatronics\n" +
            "Optoelectronic instrumentation\n" +
            "Entrepreneurship development\n" +
            "Intellectual Property Rights\n" +
            "Digital Marketing\n" +
            "Project management","Process loop component\n" +
            "Digital Signal processing\n" +
            "Unit operations\n" +
            "Environmental instrumentation\n" +
            "MEMS\n" +
            "Reliability engineering\n" +
            "Internet of things\n" +
            "Swayam online courses\n" +
            "Robotics\n" +
            "Computer organization\n" +
            "Advanced biomedical instrumentation\n" +
            "Embedded product design"};
    private String bTechInstrunmentation[] = {"Process instrumentation and control\n" +
            "Industrial automation\n" +
            "Management information systems\n" +
            "System engineer and management\n" +
            "Bio- informatics\n" +
            "Avionics","Process data Analytics\n" +
            "Digital control\n" +
            "Building automation\n" +
            "Process modelling and optimization\n" +
            "Power plant and safety instrumentation\n" +
            "Advance digital signal and image processing\n" +
            "System on chip\n" +
            "Instrumentation in agriculture and food industry"};
    private int yearFlag = 0,departmentFlag = 0;


    private Spinner spinnerYear,spinnerDepartment,spinnerCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_course);

        spinnerCourse = findViewById(R.id.spinnerTeacherCourse);
        spinnerDepartment = findViewById(R.id.spinnerTeacherDepartment);
        spinnerYear = findViewById(R.id.spinnerTeacherYear);

        button = findViewById(R.id.goAhead);

        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startQuestionsActivity();
            }
        });*/

        spinnerCourse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int subject = spinnerCourse.getSelectedItemPosition();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinnerYear.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                yearFlag = 0;
                String year = spinnerYear.getSelectedItem().toString();
                if(year.equals("FY")) {
                    yearFlag = 1;
                }else if (year.equals("SY")) {
                    yearFlag = 2;
                }else if (year.equals("TY")) {
                    yearFlag = 3;
                }else if (year.equals("B-Tech")) {
                    yearFlag = 4;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        final ArrayAdapter aCompFY = new ArrayAdapter(this,android.R.layout.simple_spinner_item,fyComp);
        aCompFY.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter aCompSY = new ArrayAdapter(this,android.R.layout.simple_spinner_item,syComp);
        aCompSY.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter aCompTY = new ArrayAdapter(this,android.R.layout.simple_spinner_item,tyComp);
        aCompTY.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter aCompBTech = new ArrayAdapter(this,android.R.layout.simple_spinner_item,bTechComp);
        aCompBTech.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter aENTCFY = new ArrayAdapter(this,android.R.layout.simple_spinner_item,fyENTC);
        aENTCFY.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter aENTCSY = new ArrayAdapter(this,android.R.layout.simple_spinner_item,syENTC);
        aENTCSY.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter aENTCTY = new ArrayAdapter(this,android.R.layout.simple_spinner_item,tyENTC);
        aENTCTY.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter aENTCBTech = new ArrayAdapter(this,android.R.layout.simple_spinner_item,bTechENTC);
        aENTCBTech.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter aMechanicalFY = new ArrayAdapter(this,android.R.layout.simple_spinner_item,fyMechanical);
        aMechanicalFY.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter aMechanicalSY = new ArrayAdapter(this,android.R.layout.simple_spinner_item,syMechanical);
        aMechanicalSY.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter aMechanicalTY = new ArrayAdapter(this,android.R.layout.simple_spinner_item,tyMechanical);
        aMechanicalTY.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter aMechanicalBTech = new ArrayAdapter(this,android.R.layout.simple_spinner_item,bTechMechanical);
        aMechanicalBTech.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter aInstrunmentationFY = new ArrayAdapter(this,android.R.layout.simple_spinner_item,fyInstrunmentation);
        aInstrunmentationFY.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter aInstrunmentationSY = new ArrayAdapter(this,android.R.layout.simple_spinner_item,syInstrunmentation);
        aInstrunmentationSY.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter aInstrunmentationTY = new ArrayAdapter(this,android.R.layout.simple_spinner_item,tyInstrunmentation);
        aInstrunmentationTY.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter aInstrunmentationBTech = new ArrayAdapter(this,android.R.layout.simple_spinner_item,bTechInstrunmentation);
        aInstrunmentationBTech.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter aITFY = new ArrayAdapter(this,android.R.layout.simple_spinner_item,fyIT);
        aITFY.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter aITSY = new ArrayAdapter(this,android.R.layout.simple_spinner_item,syIT);
        aITSY.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter aITTY = new ArrayAdapter(this,android.R.layout.simple_spinner_item,tyIT);
        aITTY.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter aITBTech = new ArrayAdapter(this,android.R.layout.simple_spinner_item,bTechIT);
        aITBTech.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerDepartment.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                departmentFlag = 0;
                String dept = spinnerDepartment.getSelectedItem().toString();
                if (dept.equals("Computer")) {
                    departmentFlag = 1;
                } else if (dept.equals("ENTC")) {
                    departmentFlag = 2;
                } else if (dept.equals("Mechanical")) {
                    departmentFlag = 3;
                } else if (dept.equals("Instrunmentation")) {
                    departmentFlag = 4;
                } else if (dept.equals("IT")) {
                    departmentFlag = 5;
                }

                spinnerCourse.setEnabled(true);

                if (departmentFlag == 1) {
                    if (yearFlag == 1)
                    {
                        spinnerCourse.setAdapter(aCompFY);
                    }
                    else if (yearFlag == 2)
                    {
                        spinnerCourse.setAdapter(aCompSY);
                    }
                    else if (yearFlag == 3)
                    {
                        spinnerCourse.setAdapter(aCompTY);
                    }
                    else if (yearFlag == 4)
                    {
                        spinnerCourse.setAdapter(aCompBTech);
                    }
                }
                else if (departmentFlag == 2) {
                    if (yearFlag == 1)
                    {
                        spinnerCourse.setAdapter(aENTCFY);
                    }
                    else if (yearFlag == 2)
                    {
                        spinnerCourse.setAdapter(aENTCSY);
                    }
                    else if (yearFlag == 3)
                    {
                        spinnerCourse.setAdapter(aENTCTY);
                    }
                    else if (yearFlag == 4)
                    {
                        spinnerCourse.setAdapter(aENTCBTech);
                    }
                }
                else if (departmentFlag == 3)
                {
                    if(yearFlag == 1)
                    {
                        spinnerCourse.setAdapter(aMechanicalFY);
                    }else if (yearFlag == 2)
                    {
                        spinnerCourse.setAdapter(aMechanicalSY);
                    }
                    else if (yearFlag == 3)
                    {
                        spinnerCourse.setAdapter(aMechanicalTY);
                    }
                    else if (yearFlag == 4)
                    {
                        spinnerCourse.setAdapter(aMechanicalBTech);
                    }
                }
                else if (departmentFlag == 4)
                {
                    if(yearFlag == 1)
                    {
                        spinnerCourse.setAdapter(aInstrunmentationFY);
                    }
                    else if (yearFlag == 2)
                    {
                        spinnerCourse.setAdapter(aInstrunmentationSY);
                    }
                    else if (yearFlag == 3)
                    {
                        spinnerCourse.setAdapter(aInstrunmentationTY);
                    }
                    else if (yearFlag == 4)
                    {
                        spinnerCourse.setAdapter(aInstrunmentationBTech);
                    }
                }
                else if (departmentFlag == 5)
                {
                    if(yearFlag == 1)
                    {
                        spinnerCourse.setAdapter(aITFY);
                    }
                    else if (yearFlag == 2)
                    {
                        spinnerCourse.setAdapter(aITSY);
                    }
                    else if (yearFlag == 3)
                    {
                        spinnerCourse.setAdapter(aITTY);
                    }
                    else if (yearFlag == 4)
                    {
                        spinnerCourse.setAdapter(aITBTech);
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    public void startQuestionsActivity(View view) {
        Intent intentTeacher = new Intent(TeacherCourse.this, TeacherQuestion.class);

        String year = spinnerYear.getSelectedItem().toString();
        String branch = spinnerDepartment.getSelectedItem().toString();
        String subject = spinnerCourse.getSelectedItem().toString();

        Bundle bundle = new Bundle();
        bundle.putString("year",year);
        bundle.putString("branch",branch);
        bundle.putString("subject",subject);

        intentTeacher.putExtras(bundle);
        startActivity(intentTeacher);
    }
}
