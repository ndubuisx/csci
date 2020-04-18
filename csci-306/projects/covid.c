#include <limits.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

#define TABLE_SIZE 2000

typedef struct entry_t {
    char *key;
    char *value;
    struct entry_t *next;
} entry_t;

typedef struct {
    entry_t **entries;
} ht_t;

unsigned int hash(const char *key) {
    unsigned long int value = 0;
    unsigned int i = 0;
    unsigned int key_len = strlen(key);

    // generate hash code for hashing function
    for (; i < key_len; ++i) {
        value = value * 37 + key[i];
    }

    // value should be in the range 0 <= value < TABLE_SIZE
    value = value % TABLE_SIZE;

    return value;
}

entry_t *ht_pair(const char *key, const char *value) {
    // allocate the entry
    entry_t *entry = malloc(sizeof(entry_t) * 1);
    entry->key = malloc(strlen(key) + 1);
    entry->value = malloc(strlen(value) + 1);

    // copy the key and value in place
    strcpy(entry->key, key);
    strcpy(entry->value, value);

    entry->next = NULL;

    return entry;
}

ht_t *ht_create(void) {
    // allocate table
    ht_t *hashtable = malloc(sizeof(ht_t) * 1);

    // allocate table entries
    hashtable->entries = malloc(sizeof(entry_t*) * TABLE_SIZE);

    // set each to null
    int i = 0;
    for (; i < TABLE_SIZE; ++i) {
        hashtable->entries[i] = NULL;
    }

    return hashtable;
}

void ht_set(ht_t *hashtable, const char *key, const char *value) {
    unsigned int slot = hash(key);

    // look up an entry set
    entry_t *entry = hashtable->entries[slot];

    // slot empty, insert immediately
    if (entry == NULL) {
        hashtable->entries[slot] = ht_pair(key, value);
        return;
    }

    entry_t *prev;

    while (entry != NULL) {
        // check key
        if (strcmp(entry->key, key) == 0) {
            // match found, replace value
            free(entry->value);
            entry->value = malloc(strlen(value) + 1);
            strcpy(entry->value, value);
            return;
        }

        // next entry
        prev = entry;
        entry = prev->next;
    }

    prev->next = ht_pair(key, value);
}

char *ht_get(ht_t *hashtable, const char *key) {
    unsigned int slot = hash(key);

    // find a valid slot
    entry_t *entry = hashtable->entries[slot];

    // no entry
    if (entry == NULL) {
        return NULL;
    }

    while (entry != NULL) {
        // return value if found
        if (strcmp(entry->key, key) == 0) {
            return entry->value;
        }

        // next key
        entry = entry->next;
    }

    return NULL;
}

void get_lowest(ht_t *hashtable) {
	char str[1];
	char *min_state = &str[0];
	int min_num = 0;
	int j = 0;
	
	for (int i = 0; i < TABLE_SIZE; ++i) {
        entry_t *entry = hashtable->entries[i];
		
        if (entry == NULL) {
            continue;
        }
		
				// iterate through the hash map to find lowest
        for(;;) {
						if (j == 0) {
							min_num = atoi(entry->value);
							min_state = entry->key;
							j++;
						} else if (atoi(entry->value) <= min_num) {
							min_num = atoi(entry->value);
							min_state = entry->key;
						}
					
            if (entry->next == NULL) {
                break;
            }
					
            entry = entry->next;
        }
    }
	
		printf("State with the lowest number of cases: %s \n", min_state);
}

void get_highest(ht_t *hashtable) {
	char str[1];
	char *max_state = &str[0];
	int max_num = 0;
	
	for (int i = 0; i < TABLE_SIZE; ++i) {
        entry_t *entry = hashtable->entries[i];
		
        if (entry == NULL) {
            continue;
        }
				
				// iterate through the hash map to find highest
        for(;;) {
						if (atoi(entry->value) > max_num) {
							max_num = atoi(entry->value);
							max_state = entry->key;
						}
					
            if (entry->next == NULL) {
                break;
            }
					
            entry = entry->next;
        }
    }
	
		printf("State with the highest number of cases: %s \n", max_state);
}

void get_average(ht_t *hashtable) {
	int sum = 0;
	int average = 0;
	
	for (int i = 0; i < TABLE_SIZE; ++i) {
        entry_t *entry = hashtable->entries[i];
		
        if (entry == NULL) {
            continue;
        }
				
				// iterate through the hash map to find sum
        for(;;) {					
						sum += atoi(entry->value);
					
            if (entry->next == NULL) {
                break;
            }
					
            entry = entry->next;
        }
    }
	
		// find average from sum
		average = sum/5;
		printf("Average number of cases: %d \n", average);
}

int main(int argc, char *argv[]) {	
    ht_t *covid_cases = ht_create();
		char num_of_cases[256];
		char state[256];
	
		 for (int i=1; i<=5; i++) {
			 printf("Enter number of cases: ");
			 fgets(num_of_cases, 256, stdin);
			 
			 printf("Enter corresponding state: ");
			 fgets(state, 256, stdin);
			 ht_set(covid_cases, state, num_of_cases);
		 }
	
		 get_highest(covid_cases);
		 get_lowest(covid_cases);
		 get_average(covid_cases);

    return 0;
}
