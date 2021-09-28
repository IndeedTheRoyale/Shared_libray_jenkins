#!/usr/bin/env groovy
def INPUT = input(
                    message: 'Please choose any',
                    parameters: [
                            [$class: 'ChoiceParameterDefinition',
                             choices: ['no','yes'].join('\n'),
                             name: 'input',
                             description: 'Checkbox type input'
                             ]
                            
                    ])
