Get Students: http://localhost:8081/student

Sample post, ready to copy-paste to postman (http://localhost:8081/student/all):

{
        
        "firstName": "Jakub",
        "sureName": "Jakubowski",
        "birthDate": "2019-11-12",
        "dyslexia": false,
        "address": {
            
            "street": "Polna",
            "zipCode": "09-22",
            "city": "Gliwice",
            "houseNumber": "22/3"
        },
        "clas": {
            
            "level": 1,
            "name": "a"
        },
        "marks": [
            {
                "mark": "5",
                "subjects": [
                    {
                        "name": "Niemiecki"
                    },
                    {
                        "name": "Polski"
                    }
                ]
            },
            {
                "mark": "6",
                "subjects": [
                    {
                        "name": "pol"
                    }
                ]
            }
            
        ]
    }
