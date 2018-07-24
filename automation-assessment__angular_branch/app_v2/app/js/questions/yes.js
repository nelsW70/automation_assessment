var questionsYes = [
  {
    id:1,
    question:'What automation tools do you currently use?',
    priority:1,
    options: [
      {id:1,text:'HP - QTP, UFT, LeannFT',value:'aValue'},
      {id:2,text:'IBM - RFT',value:'bValue'},
      {id:3,text:'Selenium',value:'cValue'},
      {id:4,text:'Microsoft - Coded UI',value:'dValue'},
      {id:5,text:'Performance Testing Tool',value:'dValue'},
      {id:6,text:'Others - Paid',value:'dValue', linkedTo:7},
      {id:7,text:'Please specify',value:'dValue',type:"text"},
      {id:8,text:'Others - Open Source',value:'dValue', linkedTo:9},
      {id:9,text:'Please specify',value:'dValue',type:"text"}
    ]
  },
  {
    id:2,
    question:'What kind of automation frameworks do you currently use?',
    type:"single-select",
    priority:2,
    options: [
      {id:1,text:'Descriptive Programming',value:'aValue'},
      {id:2,text:'Record & Play',value:'bValue'},
      {id:3,text:'Both',value:'cValue'}
    ]
  },
  {
    id:3,
    question:'What methodologies do you use in your Software Development Cycle?',
    priority:5,
    options: [
      {id:1,text:'Waterfall',value:'aValue'},
      {id:2,text:'Agile/Iteration',value:'bValue'},
      {id:3,text:'DevOps/ CI/ CD',value:'cValue'},
      {id:4,text:'Others',value:'dValue', linkedTo:5},
      {id:5,text:'Please specify',value:'dValue',type:"text"}
    ]
  },
  {
    id:4,
    question:'What is the Enterprise tool used for Software Development Life Cycle?',
    priority:9,
    options: [
      {id:1,text:'ALM',value:'aValue'},
      {id:2,text:'TFS',value:'bValue'},
      {id:3,text:'JIRA',value:'cValue'},
      {id:4,text:'GITS',value:'dValue'},
      {id:5,text:'Others',value:'dValue', linkedTo:6},
      {id:6,text:'Please specify',value:'dValue',type:"text"}
    ]
  },
  {
    id:5,
    question:'What platform is the application used on?',
    priority:3,
    options: [
      {id:1,text:'Desktop/Thin/Thick',value:'aValue'},
      {id:2,text:'Web Application',value:'bValue'},
      {id:3,text:'Main Frame',value:'cValue'},
      {id:4,text:'Mobile',value:'dValue'}
    ]
  },
  {
    id:6,
    question:'What are the major browsers used?',
    priority:10,
    options: [
      {id:1,text:'IE',value:'aValue'},
      {id:2,text:'Firefox',value:'bValue'},
      {id:3,text:'Chrome',value:'cValue'},
      {id:4,text:'Safari',value:'dValue'}
    ]
  },
  {
    id:7,
    question:'How many automation testers do you have in your team/company?',
    type:"single-select",
    priority:7,
    options: [
      {id:1,text:'1 to 2',value:'aValue'},
      {id:2,text:'2 to 5',value:'bValue'},
      {id:3,text:'5 to 10',value:'cValue'},
      {id:4,text:'More than 10',value:'dValue'}
    ]
  },
  {
    id:8,
    question:'What is your current automation Test Coverage?',
    type:"single-select",
    priority:4,
    options: [
      {id:1,text:'Less than 25%',value:'aValue'},
      {id:2,text:'25% to 50%',value:'bValue'},
      {id:3,text:'More than 75%',value:'dValue'}
    ]
  },
  {
    id:9,
    question:'How frequent are your release cycles?',
    priority:6,
    options: [
      {id:1,text:'Biweekly',value:'aValue'},
      {id:2,text:'Monthly',value:'bValue'},
      {id:3,text:'Quarterly',value:'cValue'},
      {id:4,text:'Semi Annual',value:'dValue'},
      {id:5,text:'Other',value:'dValue', linkedTo:6},
      {id:6,text:'Please specify',value:'dValue',type:"text"}   
    ]
  },
  {
    id:10,
    question:'What is the current percentage of production defects, detected by automation scripts?',
    priority:8,
    type:"single-select",
    options: [
      {id:1,text:'Less than 25%',value:'aValue'},
      {id:2,text:'25% to 50%',value:'bValue'},
      {id:3,text:'50% to 75%',value:'cValue'},
      {id:4,text:'More than 75%',value:'dValue'}
    ]
  }
];
