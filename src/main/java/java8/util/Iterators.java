/*
 * Copyright (c) 2012, 2021, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package java8.util;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

import java8.util.function.Consumer;
import java8.util.function.DoubleConsumer;
import java8.util.function.IntConsumer;
import java8.util.function.LongConsumer;

/**
 * A place for static default implementations of the new Java 8
 * default interface methods and static interface methods in the
 * {@link Iterator} interface. 
 */
public final class Iterators {
    /**
     * Performs the given action for each remaining element until all elements
     * have been processed or the action throws an exception.  Actions are
     * performed in the order of iteration, if that order is specified.
     * Exceptions thrown by the action are relayed to the caller.
     * <p>
     * The behavior of an iterator is unspecified if the action modifies the
     * source of elements in any way (even by calling the {@link Iterator#remove remove}
     * method or other mutator methods of {@code Iterator} subtypes),
     * unless an overriding class has specified a concurrent modification policy.
     * <p>
     * Subsequent behavior of an iterator is unspecified if the action throws an
     * exception.
     *
     * <p>The implementation behaves as if:
     * <pre>{@code
     *     while (it.hasNext())
     *       action.accept(it.next());
     * }</pre>
     * 
     * @param <E> the type of the elements for the passed iterator
     * @param it the {@code Iterator} whose remaining elements should be processed
     * @param action The action to be performed for each element
     * @throws NullPointerException if the specified iterator is null
     * @throws NullPointerException if the specified action is null
     * @since 1.8
     */
    public static <E> void forEachRemaining(Iterator<E> it, Consumer<? super E> action) {
        Objects.requireNonNull(it);
        Objects.requireNonNull(action);
        while (it.hasNext()) {
            action.accept(it.next());
        }
    }

    /**
     * Performs the given action for each remaining element until all elements
     * have been processed or the action throws an exception.  Actions are
     * performed in the order of iteration, if that order is specified.
     * Exceptions thrown by the action are relayed to the caller.
     * <p>
     * The behavior of an iterator is unspecified if the action modifies the
     * source of elements in any way (even by calling the {@link Iterator#remove remove}
     * method or other mutator methods of {@code Iterator} subtypes),
     * unless an overriding class has specified a concurrent modification policy.
     * <p>
     * Subsequent behavior of an iterator is unspecified if the action throws an
     * exception.
     *
     * <p>The implementation behaves as if:
     * <pre>{@code
     *     while (it.hasNext())
     *       action.accept(it.next());
     * }</pre>
     * 
     * @param it the {@code Iterator} whose remaining elements should be processed
     * @param action The action to be performed for each element
     * @throws NullPointerException if the specified iterator is null
     * @throws NullPointerException if the specified action is null
     * @since 1.8
     */
    public static void forEachRemaining(PrimitiveIterator.OfInt it, IntConsumer action) {
        Objects.requireNonNull(it);
        Objects.requireNonNull(action);
        while (it.hasNext()) {
            action.accept(it.nextInt());
        }
    }

    /**
     * Performs the given action for each remaining element until all elements
     * have been processed or the action throws an exception.  Actions are
     * performed in the order of iteration, if that order is specified.
     * Exceptions thrown by the action are relayed to the caller.
     * <p>
     * The behavior of an iterator is unspecified if the action modifies the
     * source of elements in any way (even by calling the {@link Iterator#remove remove}
     * method or other mutator methods of {@code Iterator} subtypes),
     * unless an overriding class has specified a concurrent modification policy.
     * <p>
     * Subsequent behavior of an iterator is unspecified if the action throws an
     * exception.
     *
     * <p>The implementation behaves as if:
     * <pre>{@code
     *     while (it.hasNext())
     *       action.accept(it.next());
     * }</pre>
     * 
     * @param it the {@code Iterator} whose remaining elements should be processed
     * @param action The action to be performed for each element
     * @throws NullPointerException if the specified iterator is null
     * @throws NullPointerException if the specified action is null
     * @since 1.8
     */
    public static void forEachRemaining(PrimitiveIterator.OfLong it, LongConsumer action) {
        Objects.requireNonNull(it);
        Objects.requireNonNull(action);
        while (it.hasNext()) {
            action.accept(it.nextLong());
        }
    }

    /**
     * Performs the given action for each remaining element until all elements
     * have been processed or the action throws an exception.  Actions are
     * performed in the order of iteration, if that order is specified.
     * Exceptions thrown by the action are relayed to the caller.
     * <p>
     * The behavior of an iterator is unspecified if the action modifies the
     * source of elements in any way (even by calling the {@link Iterator#remove remove}
     * method or other mutator methods of {@code Iterator} subtypes),
     * unless an overriding class has specified a concurrent modification policy.
     * <p>
     * Subsequent behavior of an iterator is unspecified if the action throws an
     * exception.
     *
     * <p>The implementation behaves as if:
     * <pre>{@code
     *     while (it.hasNext())
     *       action.accept(it.next());
     * }</pre>
     * 
     * @param it the {@code Iterator} whose remaining elements should be processed
     * @param action The action to be performed for each element
     * @throws NullPointerException if the specified iterator is null
     * @throws NullPointerException if the specified action is null
     * @since 1.8
     */
    public static void forEachRemaining(PrimitiveIterator.OfDouble it, DoubleConsumer action) {
        Objects.requireNonNull(it);
        Objects.requireNonNull(action);
        while (it.hasNext()) {
            action.accept(it.nextDouble());
        }
    }

    /**
     * Returns an {@link Iterator} that traverses the remaining elements
     * covered by the passed enumeration. Traversal is undefined if any
     * methods are called on the passed enumeration after the call to
     * {@code asIterator}.
     *
     * <p><b>API Note:</b><br>
     * This method is intended to help adapt code that produces
     * {@code Enumeration} instances to code that consumes {@code Iterator}
     * instances. For example, the {@link java.util.jar.JarFile#entries
     * JarFile.entries()} method returns an {@code Enumeration<JarEntry>}.
     * This can be turned into an {@code Iterator}, and then the
     * {@code forEachRemaining()} method can be used:
     *
     * <pre>{@code
     *     JarFile jarFile = ... ;
     *     Iterators.forEachRemaining(Iterators.asIterator(jarFile.entries()), entry -> ... );
     * }</pre>
     *
     * <p><b>Implementation Requirements:</b><br>
     * The default implementation returns an {@code Iterator} whose
     * {@link Iterator#hasNext hasNext} method calls the passed Enumeration's
     * {@code hasMoreElements} method, whose {@link Iterator#next next}
     * method calls the passed Enumeration's {@code nextElement} method,
     * and whose {@link Iterator#remove remove} method throws
     * {@code UnsupportedOperationException}.
     *
     * @param <E> the type of the elements for the passed enumeration
     * @param en the {@code Enumeration} whose remaining elements should be processed
     * @return an Iterator representing the remaining elements of the
     * passed Enumeration
     * @throws NullPointerException if the specified enumeration is null
     *
     * @since 9
     */
    public static <E> Iterator<E> asIterator(Enumeration<E> en) {
        Objects.requireNonNull(en);
        return new ImmutableIt<E>() {
            @Override
            public boolean hasNext() {
                return en.hasMoreElements();
            }
            @Override
            public E next() {
                return en.nextElement();
            }
        };
    }

    /**
     * Returns an iterator that has no elements. More precisely,
     *
     * <ul>
     * <li>{@link Iterator#hasNext hasNext} always returns {@code false}.</li>
     * <li>{@link Iterator#next next} always throws
     * {@link NoSuchElementException}.</li>
     * <li>{@link Iterator#remove remove} always throws
     * {@link IllegalStateException}.</li>
     * </ul>
     *
     * <p>
     * Implementations of this method are permitted, but not required, to return
     * the same object from multiple invocations.
     *
     * @param <T>
     *            type of elements, if there were any, in the iterator
     * @return an empty iterator
     * @since 1.7
     */
    @SuppressWarnings("unchecked")
    public static <T> Iterator<T> emptyIterator() {
        return (Iterator<T>) EmptyIt.EMPTY_ITERATOR;
    }

    static <E> Iterator<E> singletonIterator(E e) {
        return new ImmutableIt<E>() {
            private boolean hasNext = true;
            public boolean hasNext() {
                return hasNext;
            }
            public E next() {
                if (hasNext) {
                    hasNext = false;
                    return e;
                }
                throw new NoSuchElementException();
            }
        };
    }

    static final class EmptyIt<E> extends ImmutableIt<E> {
        static final EmptyIt<Object> EMPTY_ITERATOR = new EmptyIt<Object>();

        public boolean hasNext() {
            return false;
        }

        public E next() {
            throw new NoSuchElementException();
        }
    }

    static abstract class ImmutableIt<T> implements Iterator<T> {
        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    private Iterators() {
    }
}
