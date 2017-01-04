ArrayDeque
    - add to index 0 at O(1) time
    - delete the index 0 at O(1) time
    - add to index [size] at O(1) time
    - delete the index [size] at O(1) time

class ArrayDeque
    array[N]
    curr = -1

    insertHead(item)
        array[0] = item
        if (curr == -1)
            curr = 0

    insertTail(item)
        array[++curr] = item

    removeHead()
        array[0] = null

    removeTail()
        if (curr == -1)
            throw IndexOutOfBoundsException
        return array[curr--]

    get(idx)
        if (idx > curr)
            throw IndexOutOfBoundsException
        return array[idx]
