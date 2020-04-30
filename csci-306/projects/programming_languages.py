class ProgrammingLanguages:
  def python(self, output = None, input_= None, comment = None, loop = None):
    argument = output or input_ or comment or loop

    if (argument == output):
      return f'print(\'{output}\')'
    elif (argument == input_):
      if (input_ == 'integer' or input_ == 'int'):
        return 'x = int(input())'
      else:
        return 'x = input()'
    elif (argument == comment):
      return f'# {comment}'
    elif (argument == loop):
      return f'for i in range({loop[0]}):\n\tprintf(\'{loop[1]}\')'
    else:
      return False

  def cpp(self, output = None, input_= None, comment = None, loop = None):
    argument = output or input_ or comment or loop

    if (argument == output):
      return f'\tprintf(\'{output}\');'
    elif (argument == input_):
      if (input_ == 'integer' or input_ == 'int'):
        return '\tint i;\n\tcin >> i;'
      else:
        return '\tstring mystring;\n\tcin >> mystring;'
    elif (argument == comment):
      return f'\t// {comment}'
    elif (argument == loop):
      return '\tfor (int i = 0; i < %d; i++){ \n\t printf(\'%s\'); \n\t}' % (loop[0], loop[1])
    else:
      return False

  def c(self, output = None, input_= None, comment = None, loop = None):
    argument = output or input_ or comment or loop

    if (argument == output):
      return f'\tprintf(\'{output}\');'
    elif (argument == input_):
      if (input_ == 'integer' or input_ == 'int'):
        return '\tint i;\n\tscanf("%d", &i);'
      else:
        return '\tchar str[10];\n\tscanf("%s", str);'
    elif (argument == comment):
      return f'\t// {comment}'
    elif (argument == loop):
      return '\tfor (int i = 0; i < %d; i++){ \n\t printf(\'%s\'); \n\t}' % (loop[0], loop[1])
    else:
      return False

if __name__ == "__main__":
  language_option = input('Hello please choose an option – A: Write a Python program, B: Write a C++ program, C: Write a C program \n')
  filename = input('Please enter your filename: \n')
  end_program = False

  pl = ProgrammingLanguages()
  result = ''

  if (language_option.lower() == 'a'):
    while (not end_program):
      prompt = int(input('Choose an option – 1: Output, 2: Input, 3: Comment, 4: Create a Loop, 5: End program: \n'))

      if (prompt == 1):
        output_prompt = input('Enter output: \n')
        result = result + pl.python(output_prompt, None, None, None) + '\n'
      elif (prompt == 2):
        input_prompt = input('Enter type of input: \n')
        result = result + pl.python(None, input_prompt, None, None) + '\n'
      elif (prompt == 3):
        comment_prompt = input('Enter comment: \n')
        result = result + pl.python(None, None, comment_prompt, None) + '\n'
      elif (prompt == 4):
        loop_count = int(input('Enter number of times to run loop: \n'))
        loop_output = input('Enter output for loop: \n')
        loop_argument = [loop_count, loop_output]
        result = result + pl.python(None, None, None, loop_argument) + '\n'
      elif (prompt == 5):
        end_program = True
    print(result)   
  elif (language_option.lower() == 'b'):
    result = result + 'int main() { \n'
    while (not end_program):
      prompt = int(input('Choose an option – 1: Output, 2: Input, 3: Comment, 4: Create a Loop, 5: End program: \n'))

      if (prompt == 1):
        output_prompt = input('Enter output: \n')
        result = result + pl.cpp(output_prompt, None, None, None) + '\n'
      elif (prompt == 2):
        input_prompt = input('Enter type of input: \n')
        result = result + pl.cpp(None, input_prompt, None, None) + '\n'
      elif (prompt == 3):
        comment_prompt = input('Enter comment: \n')
        result = result + pl.cpp(None, None, comment_prompt, None) + '\n'
      elif (prompt == 4):
        loop_count = int(input('Enter number of times to run loop: \n'))
        loop_output = input('Enter output for loop: \n')
        loop_argument = [loop_count, loop_output]
        result = result + pl.cpp(None, None, None, loop_argument) + '\n'
      elif (prompt == 5):
        result = result + '\treturn 0;\n}'        
        end_program = True
    print(result)
  elif (language_option.lower() == 'c'):
    result = result + 'int main() { \n'
    while (not end_program):
      prompt = int(input('Choose an option – 1: Output, 2: Input, 3: Comment, 4: Create a Loop, 5: End program: \n'))

      if (prompt == 1):
        output_prompt = input('Enter output: \n')
        result = result + pl.c(output_prompt, None, None, None) + '\n'
      elif (prompt == 2):
        input_prompt = input('Enter type of input: \n')
        result = result + pl.c(None, input_prompt, None, None) + '\n'
      elif (prompt == 3):
        comment_prompt = input('Enter comment: \n')
        result = result + pl.c(None, None, comment_prompt, None) + '\n'
      elif (prompt == 4):
        loop_count = int(input('Enter number of times to run loop: \n'))
        loop_output = input('Enter output for loop: \n')
        loop_argument = [loop_count, loop_output]
        result = result + pl.c(None, None, None, loop_argument) + '\n'
      elif (prompt == 5):
        result = result + '\treturn 0;\n}'
        end_program = True
    
    print(result)
  else:
    print("I could not understand your option.")
